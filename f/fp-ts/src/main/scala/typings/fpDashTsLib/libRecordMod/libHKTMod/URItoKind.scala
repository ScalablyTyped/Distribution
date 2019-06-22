package typings
package fpDashTsLib.libRecordMod.libHKTMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait URItoKind[A] extends js.Object {
  var Record: stdLib.Record[java.lang.String, A]
}

object URItoKind {
  @scala.inline
  def apply[A](Record: stdLib.Record[java.lang.String, A]): URItoKind[A] = {
    val __obj = js.Dynamic.literal(Record = Record)
  
    __obj.asInstanceOf[URItoKind[A]]
  }
}

