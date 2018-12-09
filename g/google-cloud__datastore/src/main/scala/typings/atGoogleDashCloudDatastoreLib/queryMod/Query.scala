package typings
package atGoogleDashCloudDatastoreLib.queryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@google-cloud/datastore/query", "Query")
@js.native
class Query protected () extends js.Object {
  def this(scope: java.lang.String, kinds: java.lang.String, namespace: java.lang.String) = this()
  def end(cursorToken: java.lang.String): this.type = js.native
  def filter(property: java.lang.String, operator: QueryFilterOperator, value: js.Any): this.type = js.native
  def filter(property: java.lang.String, value: js.Any): this.type = js.native
  def groupBy(properties: java.lang.String): this.type = js.native
  def groupBy(properties: js.Array[java.lang.String]): this.type = js.native
  def hasAncestor(key: atGoogleDashCloudDatastoreLib.entityMod.DatastoreKey): this.type = js.native
  def limit(n: scala.Double): this.type = js.native
  def offset(n: scala.Double): this.type = js.native
  def order(property: java.lang.String): this.type = js.native
  def order(property: java.lang.String, options: OrderOptions): this.type = js.native
  def run(): js.Promise[QueryResult] = js.native
  def run(callback: QueryCallback): scala.Unit = js.native
  def run(options: QueryOptions): js.Promise[QueryResult] = js.native
  def run(options: QueryOptions, callback: QueryCallback): scala.Unit = js.native
  def runStream(): nodeLib.NodeJSNs.ReadableStream = js.native
  def select(properties: java.lang.String): this.type = js.native
  def select(properties: js.Array[java.lang.String]): this.type = js.native
  def start(cursorToken: java.lang.String): this.type = js.native
}

