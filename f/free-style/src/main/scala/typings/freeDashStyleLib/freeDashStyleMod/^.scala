package typings
package freeDashStyleLib.freeDashStyleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("free-style", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val IS_UNIQUE: freeDashStyleLib.freeDashStyleLibStrings.__DO_NOT_DEDUPE_STYLE__ = js.native
  def create(): FreeStyle = js.native
  def create(hash: HashFunction): FreeStyle = js.native
  def create(hash: HashFunction, debug: scala.Boolean): FreeStyle = js.native
  def create(hash: HashFunction, debug: scala.Boolean, changes: Changes): FreeStyle = js.native
  def escape(str: java.lang.String): java.lang.String = js.native
  def hyphenate(propertyName: java.lang.String): java.lang.String = js.native
  def stringHash(str: java.lang.String): java.lang.String = js.native
}

