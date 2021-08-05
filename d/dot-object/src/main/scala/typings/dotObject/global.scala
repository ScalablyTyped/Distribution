package typings.dotObject

import typings.dotObject.DotObject.Dot
import typings.dotObject.DotObject.DotConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("dot")
  @js.native
  class dot protected ()
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
  @JSGlobal("dot")
  @js.native
  def dot: DotConstructor = js.native
  inline def dot_=(x: DotConstructor): Unit = js.Dynamic.global.updateDynamic("dot")(x.asInstanceOf[js.Any])
}
