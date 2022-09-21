package typings.documentdb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PartitionResolver extends StObject {
  
  /**
    * Extracts the partition key from the specified document using the partitionKeyExtractor
    * @param document - The document from which to extract the partition key.
    */
  def getPartitionKey(document: Any): String
  
  /**
    * Given a partition key, returns the correct collection link for creating a document.
    * @param partitionKey - The partition key used to determine the target collection for create
    */
  def resolveForCreate(partitionKey: String): String
  
  /**
    * Given a partition key, returns a list of collection links to read from.
    * @param partitionKey - The partition key used to determine the target collection for query
    */
  def resolveForRead(partitionKey: Any): js.Array[String]
}
object PartitionResolver {
  
  inline def apply(
    getPartitionKey: Any => String,
    resolveForCreate: String => String,
    resolveForRead: Any => js.Array[String]
  ): PartitionResolver = {
    val __obj = js.Dynamic.literal(getPartitionKey = js.Any.fromFunction1(getPartitionKey), resolveForCreate = js.Any.fromFunction1(resolveForCreate), resolveForRead = js.Any.fromFunction1(resolveForRead))
    __obj.asInstanceOf[PartitionResolver]
  }
  
  extension [Self <: PartitionResolver](x: Self) {
    
    inline def setGetPartitionKey(value: Any => String): Self = StObject.set(x, "getPartitionKey", js.Any.fromFunction1(value))
    
    inline def setResolveForCreate(value: String => String): Self = StObject.set(x, "resolveForCreate", js.Any.fromFunction1(value))
    
    inline def setResolveForRead(value: Any => js.Array[String]): Self = StObject.set(x, "resolveForRead", js.Any.fromFunction1(value))
  }
}
