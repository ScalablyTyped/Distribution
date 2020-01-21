package typings.googleCloudDatastore.queryMod

import typings.googleCloudDatastore.entityMod.DatastoreKey
import typings.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@google-cloud/datastore/query", "Query")
@js.native
class Query protected () extends js.Object {
  def this(scope: String, kinds: String, namespace: String) = this()
  def end(cursorToken: String): this.type = js.native
  def filter(property: String, operator: QueryFilterOperator, value: js.Any): this.type = js.native
  def filter(property: String, value: js.Any): this.type = js.native
  def groupBy(properties: String): this.type = js.native
  def groupBy(properties: js.Array[String]): this.type = js.native
  def hasAncestor(key: DatastoreKey): this.type = js.native
  def limit(n: Double): this.type = js.native
  def offset(n: Double): this.type = js.native
  def order(property: String): this.type = js.native
  def order(property: String, options: OrderOptions): this.type = js.native
  def run(): js.Promise[QueryResult] = js.native
  def run(callback: QueryCallback): Unit = js.native
  def run(options: QueryOptions): js.Promise[QueryResult] = js.native
  def run(options: QueryOptions, callback: QueryCallback): Unit = js.native
  def runStream(): ReadableStream = js.native
  def select(properties: String): this.type = js.native
  def select(properties: js.Array[String]): this.type = js.native
  def start(cursorToken: String): this.type = js.native
}

