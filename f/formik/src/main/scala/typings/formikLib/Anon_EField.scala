package typings
package formikLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EField extends js.Object {
  var name: java.lang.String
  var onBlur: (js.Function1[/* e */ reactLib.reactMod.ReactNs.FocusEvent[_], scala.Unit]) | (js.Function1[
    /* fieldOrEvent */ js.Any, 
    /* import warning: ImportType.apply Failed type conversion: T extends string ? (e : any): void : void */ js.Any
  ])
  var onChange: (js.Function1[/* e */ reactLib.reactMod.ReactNs.ChangeEvent[_], scala.Unit]) | (js.Function1[
    /* field */ js.Any, 
    /* import warning: ImportType.apply Failed type conversion: T extends React.ChangeEvent<any> ? void : (e : string | react.react.React.ChangeEvent<any>): void */ js.Any
  ])
  var value: js.Any
}

object Anon_EField {
  @scala.inline
  def apply(
    name: java.lang.String,
    onBlur: (js.Function1[/* e */ reactLib.reactMod.ReactNs.FocusEvent[_], scala.Unit]) | (js.Function1[
      /* fieldOrEvent */ js.Any, 
      /* import warning: ImportType.apply Failed type conversion: T extends string ? (e : any): void : void */ js.Any
    ]),
    onChange: (js.Function1[/* e */ reactLib.reactMod.ReactNs.ChangeEvent[_], scala.Unit]) | (js.Function1[
      /* field */ js.Any, 
      /* import warning: ImportType.apply Failed type conversion: T extends React.ChangeEvent<any> ? void : (e : string | react.react.React.ChangeEvent<any>): void */ js.Any
    ]),
    value: js.Any
  ): Anon_EField = {
    val __obj = js.Dynamic.literal(name = name, onBlur = onBlur.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any], value = value)
  
    __obj.asInstanceOf[Anon_EField]
  }
}

