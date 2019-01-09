package typings
package fibjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Charset extends js.Object {
  def decode(charset: java.lang.String, data: Class_Buffer): java.lang.String
  def encode(charset: java.lang.String, data: java.lang.String): Class_Buffer
  def isEncoding(charset: java.lang.String): scala.Boolean
}

