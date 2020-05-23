package typings.formsyReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object interfacesMod {
  type IModel = js.Any
  type IResetModel = js.Function1[/* model */ js.UndefOr[typings.formsyReact.interfacesMod.IModel], scala.Unit]
  type IUpdateInputsWithError = js.Function2[
    /* errors */ org.scalablytyped.runtime.StringDictionary[typings.formsyReact.interfacesMod.ValidationError], 
    /* invalidate */ js.UndefOr[scala.Boolean], 
    scala.Unit
  ]
  type IUpdateInputsWithValue[V] = js.Function2[
    /* values */ org.scalablytyped.runtime.StringDictionary[V], 
    /* validate */ js.UndefOr[scala.Boolean], 
    scala.Unit
  ]
  type RequiredValidation[V] = scala.Boolean | typings.formsyReact.interfacesMod.Validations[V]
  type Validation[V] = java.lang.String | scala.Boolean | typings.formsyReact.interfacesMod.ValidationFunction[V]
  type ValidationError = java.lang.String | typings.react.mod.ReactNode
  type ValidationFunction[V] = js.Function3[
    /* values */ typings.formsyReact.interfacesMod.Values, 
    /* value */ V, 
    /* extra */ js.UndefOr[js.Any], 
    scala.Boolean | typings.formsyReact.interfacesMod.ValidationError
  ]
  type Validations[V] = typings.formsyReact.interfacesMod.ValidationsStructure[V] | java.lang.String | js.Object
  type ValidationsStructure[V] = org.scalablytyped.runtime.StringDictionary[typings.formsyReact.interfacesMod.Validation[V]]
  type Values = org.scalablytyped.runtime.StringDictionary[js.Any]
  type WrappedComponentClass = typings.react.mod.FC[js.Object] | typings.formsyReact.interfacesMod.ComponentWithStaticAttributes
}
