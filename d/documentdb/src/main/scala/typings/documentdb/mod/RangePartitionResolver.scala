package typings.documentdb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("documentdb", "RangePartitionResolver")
@js.native
open class RangePartitionResolver protected ()
  extends StObject
     with PartitionResolver {
  /**
    * DEPRECATED
    *
    * Support for IPartitionResolver is now obsolete.
    * It's recommended that you use Partitioned Collections for higher storage and throughput.
    *
    * @deprecated
    * @param partitionKeyExtractor - If partitionKeyExtractor is a string, it should be the name of the property in the document to execute the
    *        hashing on. If partitionKeyExtractor is a function, it should be a function to extract the partition key from an object.
    * @param partitionKeyMap       - The map from Range to collection link that is used for partitioning requests.
    * @param [compareFunction]       - Optional function that accepts two arguments a and b and returns a negative value if a < b, zero if a = b, or a positive value if a > b.
    */
  def this(partitionKeyExtractor: String, partitionKeyMap: js.Array[PartitionKeyMap]) = this()
  def this(
    partitionKeyExtractor: js.Function1[/* obj */ Any, Any],
    partitionKeyMap: js.Array[PartitionKeyMap]
  ) = this()
  def this(
    partitionKeyExtractor: String,
    partitionKeyMap: js.Array[PartitionKeyMap],
    compareFunction: js.Function2[/* a */ Any, /* b */ Any, Double]
  ) = this()
  def this(
    partitionKeyExtractor: js.Function1[/* obj */ Any, Any],
    partitionKeyMap: js.Array[PartitionKeyMap],
    compareFunction: js.Function2[/* a */ Any, /* b */ Any, Double]
  ) = this()
  
  /**
    * Extracts the partition key from the specified document using the partitionKeyExtractor
    * @param document - The document from which to extract the partition key.
    */
  /* CompleteClass */
  override def getPartitionKey(document: Any): String = js.native
  
  /**
    * Given a partition key, returns the correct collection link for creating a document.
    * @param partitionKey - The partition key used to determine the target collection for create
    */
  /* CompleteClass */
  override def resolveForCreate(partitionKey: String): String = js.native
  
  /**
    * Given a partition key, returns a list of collection links to read from.
    * @param partitionKey - The partition key used to determine the target collection for query
    */
  def resolveForRead(partitionKey: String): js.Array[String] = js.native
  /**
    * Given a partition key, returns a list of collection links to read from.
    * @param partitionKey - The partition key used to determine the target collection for query
    */
  /* CompleteClass */
  override def resolveForRead(partitionKey: Any): js.Array[String] = js.native
}
