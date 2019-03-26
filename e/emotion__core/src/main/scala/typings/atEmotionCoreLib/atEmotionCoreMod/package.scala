package typings
package atEmotionCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atEmotionCoreMod {
  type ClassNamesArg = js.UndefOr[
    scala.Null | java.lang.String | scala.Boolean | org.scalablytyped.runtime.StringDictionary[scala.Boolean] | ArrayClassNamesArg
  ]
  type InterpolationWithTheme[Theme] = atEmotionSerializeLib.atEmotionSerializeMod.Interpolation[js.UndefOr[scala.Nothing]] | (js.Function1[
    /* theme */ Theme, 
    atEmotionSerializeLib.atEmotionSerializeMod.Interpolation[js.UndefOr[scala.Nothing]]
  ])
}
