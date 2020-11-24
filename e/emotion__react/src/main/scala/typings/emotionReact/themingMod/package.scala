package typings.emotionReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object themingMod {
  
  type ThemeProvider = js.Function1[
    /* props */ typings.emotionReact.themingMod.ThemeProviderProps, 
    typings.react.mod.ReactElement
  ]
  
  type WithTheme_[P, T] = (P with typings.emotionReact.anon.ThemeT[T]) | (P with typings.emotionReact.anon.ThemeExclude)
  
  type withTheme = js.Function1[
    /* component */ js.Any, 
    typings.react.mod.FC[
      (typings.emotionReact.helperMod.DistributiveOmit[
        typings.emotionReact.helperMod.PropsOf[_], 
        typings.emotionReact.emotionReactStrings.theme
      ]) with typings.emotionReact.anon.Theme
    ]
  ]
}
