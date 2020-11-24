package typings.documentdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("documentdb", "HashPartitionResolver")
@js.native
class HashPartitionResolver protected () extends PartitionResolver {
  /**
    * DEPRECATED
    *
    * Support for IPartitionResolver is now obsolete.
    * It's recommended that you use Partitioned Collections for higher storage and throughput.
    *
    * @deprecated
    * @param partitionKeyExtractor - If partitionKeyExtractor is a string, it should be the name of the property in the document to execute the hashing on.
    *        If partitionKeyExtractor is a function, it should be a function to extract the partition key from an object.
    * @param collectionLink        - Array of strings in the format 'dbs/foo/colls/bar'
    * @param options               - Options forr the ConsistentHashRing (MurmurHash)
    */
  def this(partitionKeyExtractor: String, collectionLinks: js.Array[String]) = this()
  def this(partitionKeyExtractor: js.Function1[/* obj */ js.Any, _], collectionLinks: js.Array[String]) = this()
  def this(
    partitionKeyExtractor: String,
    collectionLinks: js.Array[String],
    options: ConsistentHashRingOptions
  ) = this()
  def this(
    partitionKeyExtractor: js.Function1[/* obj */ js.Any, _],
    collectionLinks: js.Array[String],
    options: ConsistentHashRingOptions
  ) = this()
  
  /**
    * Given a partition key, returns a list of collection links to read from.
    * @param partitionKey - The partition key used to determine the target collection for query
    */
  def resolveForRead(partitionKey: String): js.Array[String] = js.native
}
