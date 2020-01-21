package typings.firebaseDatabase

import typings.firebaseDatabase.queryMod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofTESTACCESS extends js.Object {
  def forceRestClient(forceRestClient: Boolean): Unit
  def hijackHash(newHash: js.Function0[String]): js.Function0[Unit]
  def queryIdentifier(query: Query): String
}

object TypeofTESTACCESS {
  @scala.inline
  def apply(
    forceRestClient: Boolean => Unit,
    hijackHash: js.Function0[String] => js.Function0[Unit],
    queryIdentifier: Query => String
  ): TypeofTESTACCESS = {
    val __obj = js.Dynamic.literal(forceRestClient = js.Any.fromFunction1(forceRestClient), hijackHash = js.Any.fromFunction1(hijackHash), queryIdentifier = js.Any.fromFunction1(queryIdentifier))
  
    __obj.asInstanceOf[TypeofTESTACCESS]
  }
}

