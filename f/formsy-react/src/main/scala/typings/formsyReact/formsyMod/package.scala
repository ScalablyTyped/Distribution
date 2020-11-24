package typings.formsyReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object formsyMod {
  
  type OnSubmitCallback = js.Function4[
    /* model */ typings.formsyReact.interfacesMod.IModel, 
    /* resetModel */ typings.formsyReact.interfacesMod.IResetModel, 
    /* updateInputsWithError */ typings.formsyReact.interfacesMod.IUpdateInputsWithError, 
    /* event */ typings.react.mod.SyntheticEvent[typings.react.mod.FormHTMLAttributes[js.Any], typings.std.Event], 
    scala.Unit
  ]
}
