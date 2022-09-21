package typings.dotObject

import org.scalablytyped.runtime.Shortcut
import typings.dotObject.DotObject.Dot
import typings.dotObject.DotObject.DotConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("dot-object", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Dot {
    def this(separator: String) = this()
    def this(separator: String, `override`: Boolean) = this()
    def this(separator: String, `override`: Boolean, useArray: Boolean) = this()
    def this(separator: String, `override`: Unit, useArray: Boolean) = this()
    def this(separator: String, `override`: Boolean, useArray: Boolean, useBrackets: Boolean) = this()
    def this(separator: String, `override`: Boolean, useArray: Unit, useBrackets: Boolean) = this()
    def this(separator: String, `override`: Unit, useArray: Boolean, useBrackets: Boolean) = this()
    def this(separator: String, `override`: Unit, useArray: Unit, useBrackets: Boolean) = this()
  }
  @JSImport("dot-object", JSImport.Namespace)
  @js.native
  val ^ : js.Object & DotConstructor = js.native
  
  type _To = js.Object & DotConstructor
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Object & DotConstructor = ^
}
