package typings.atEmotionCore

import org.scalablytyped.runtime.StringDictionary
import typings.atEmotionSerialize.atEmotionSerializeMod.Interpolation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atEmotionCoreMod {
  type ClassNamesArg = js.UndefOr[Null | String | Boolean | StringDictionary[Boolean] | ArrayClassNamesArg]
  type InterpolationWithTheme[Theme] = Interpolation[js.UndefOr[scala.Nothing]] | (js.Function1[/* theme */ Theme, Interpolation[js.UndefOr[scala.Nothing]]])
}
