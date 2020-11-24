package typings.dotObject

import org.scalablytyped.runtime.TopLevel
import typings.dotObject.DotObject.Dot
import typings.dotObject.DotObject.DotConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  class dot protected () extends Dot {
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
  @js.native
  object dot extends TopLevel[DotConstructor]
}
