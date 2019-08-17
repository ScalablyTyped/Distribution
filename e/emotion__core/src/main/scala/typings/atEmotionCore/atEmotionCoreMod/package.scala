package typings.atEmotionCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atEmotionCoreMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.atEmotionSerialize.atEmotionSerializeMod.Interpolation

  type ClassNamesArg = js.UndefOr[Null | String | Boolean | StringDictionary[Boolean] | ArrayClassNamesArg]
  type InterpolationWithTheme[Theme] = Interpolation[js.UndefOr[scala.Nothing]] | (js.Function1[/* theme */ Theme, Interpolation[js.UndefOr[scala.Nothing]]])
}
