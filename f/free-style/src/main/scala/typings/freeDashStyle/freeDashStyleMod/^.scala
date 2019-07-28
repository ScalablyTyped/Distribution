package typings.freeDashStyle.freeDashStyleMod

import typings.freeDashStyle.freeDashStyleStrings.__DO_NOT_DEDUPE_STYLE__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("free-style", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val IS_UNIQUE: __DO_NOT_DEDUPE_STYLE__ = js.native
  def create(): FreeStyle = js.native
  def create(hash: HashFunction): FreeStyle = js.native
  def create(hash: HashFunction, debug: Boolean): FreeStyle = js.native
  def create(hash: HashFunction, debug: Boolean, changes: Changes): FreeStyle = js.native
  def escape(str: String): String = js.native
  def hyphenate(propertyName: String): String = js.native
  def stringHash(str: String): String = js.native
}

