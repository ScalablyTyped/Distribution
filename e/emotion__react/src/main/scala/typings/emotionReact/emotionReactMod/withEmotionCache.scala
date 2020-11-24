package typings.emotionReact.emotionReactMod

import typings.emotionUtils.mod.EmotionCache
import typings.react.mod.ClassAttributes
import typings.react.mod.FC
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@emotion/react", "withEmotionCache")
@js.native
object withEmotionCache extends js.Object {
  
  def apply[Props, RefType](
    func: js.Function3[/* props */ Props, /* context */ EmotionCache, /* ref */ Ref[RefType], ReactNode]
  ): FC[Props with ClassAttributes[RefType]] = js.native
}
