package typings.freeStyle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("free-style", "FreeStyle")
@js.native
class FreeStyle protected ()
  extends Cache[Rule | Style]
     with Container[FreeStyle] {
  def this(hash: HashFunction, debug: Boolean, id: String) = this()
  def this(hash: HashFunction, debug: Boolean, id: String, changes: Changes) = this()
  var debug: Boolean = js.native
  @JSName("hash")
  var hash_Original: HashFunction = js.native
  /* CompleteClass */
  override var id: String = js.native
  /* CompleteClass */
  override def getStyles(): String = js.native
  def hash(str: String): String = js.native
  def registerCss(styles: Styles): Unit = js.native
  def registerHashRule(prefix: String, styles: Styles): String = js.native
  def registerHashRule(prefix: String, styles: Styles, displayName: String): String = js.native
  def registerKeyframes(keyframes: Styles): String = js.native
  def registerKeyframes(keyframes: Styles, displayName: String): String = js.native
  def registerRule(rule: String, styles: Styles): Unit = js.native
  def registerStyle(styles: Styles): String = js.native
  def registerStyle(styles: Styles, displayName: String): String = js.native
}

