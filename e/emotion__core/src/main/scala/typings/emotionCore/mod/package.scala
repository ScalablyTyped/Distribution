package typings.emotionCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ClassNamesArg = js.UndefOr[
    scala.Null | java.lang.String | scala.Boolean | org.scalablytyped.runtime.StringDictionary[scala.Boolean] | typings.emotionCore.mod.ArrayClassNamesArg
  ]
  type InterpolationWithTheme[Theme] = typings.emotionSerialize.mod.Interpolation[js.UndefOr[scala.Nothing]] | (js.Function1[
    /* theme */ Theme, 
    typings.emotionSerialize.mod.Interpolation[js.UndefOr[scala.Nothing]]
  ])
}
