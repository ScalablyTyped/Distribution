package typings
package freeDashStyleLib.freeDashStyleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("free-style", "FreeStyle")
@js.native
class FreeStyle protected ()
  extends Cache[Rule | Style]
     with Container[FreeStyle] {
  def this(hash: HashFunction, debug: scala.Boolean, id: java.lang.String) = this()
  def this(hash: HashFunction, debug: scala.Boolean, id: java.lang.String, changes: Changes) = this()
  var debug: scala.Boolean = js.native
  @JSName("hash")
  var hash_Original: HashFunction = js.native
  /* CompleteClass */
  override var id: java.lang.String = js.native
  /* CompleteClass */
  override def getStyles(): java.lang.String = js.native
  def hash(str: java.lang.String): java.lang.String = js.native
  def registerCss(styles: Styles): scala.Unit = js.native
  def registerHashRule(prefix: java.lang.String, styles: Styles): java.lang.String = js.native
  def registerHashRule(prefix: java.lang.String, styles: Styles, displayName: java.lang.String): java.lang.String = js.native
  def registerKeyframes(keyframes: Styles): java.lang.String = js.native
  def registerKeyframes(keyframes: Styles, displayName: java.lang.String): java.lang.String = js.native
  def registerRule(rule: java.lang.String, styles: Styles): scala.Unit = js.native
  def registerStyle(styles: Styles): java.lang.String = js.native
  def registerStyle(styles: Styles, displayName: java.lang.String): java.lang.String = js.native
}

