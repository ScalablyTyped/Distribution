package typings.dotObject

import org.scalablytyped.runtime.Shortcut
import typings.dotObject.DotObject.Dot
import typings.dotObject.DotObject.DotConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("dot-object", JSImport.Namespace)
  @js.native
  class ^ protected () extends Dot {
    def this(separator: String) = this()
    def this(separator: String, `override`: Boolean) = this()
    def this(separator: String, `override`: js.UndefOr[scala.Nothing], useArray: Boolean) = this()
    def this(separator: String, `override`: Boolean, useArray: Boolean) = this()
    def this(
      separator: String,
      `override`: js.UndefOr[scala.Nothing],
      useArray: js.UndefOr[scala.Nothing],
      useBrackets: Boolean
    ) = this()
    def this(separator: String, `override`: js.UndefOr[scala.Nothing], useArray: Boolean, useBrackets: Boolean) = this()
    def this(separator: String, `override`: Boolean, useArray: js.UndefOr[scala.Nothing], useBrackets: Boolean) = this()
    def this(separator: String, `override`: Boolean, useArray: Boolean, useBrackets: Boolean) = this()
  }
  @JSImport("dot-object", JSImport.Namespace)
  @js.native
  val ^ : DotConstructor = js.native
  
  type _To = DotConstructor
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: DotConstructor = ^
}
