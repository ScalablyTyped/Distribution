package typings.finalForm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AnyObject = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type ChangeValue[FormValues, InitialFormValues] = js.Function3[
    /* state */ typings.finalForm.mod.MutableState[FormValues, InitialFormValues], 
    /* name */ java.lang.String, 
    /* mutate */ js.Function1[/* value */ js.Any, js.Any], 
    scala.Unit
  ]
  
  type DebugFunction[FormValues, InitialFormValues] = js.Function2[
    /* state */ typings.finalForm.mod.FormState[FormValues, InitialFormValues], 
    /* fieldStates */ org.scalablytyped.runtime.StringDictionary[typings.finalForm.mod.FieldState[js.Any]], 
    scala.Unit
  ]
  
  type Decorator[FormValues, InitialFormValues] = js.Function1[
    /* form */ typings.finalForm.mod.FormApi[FormValues, InitialFormValues], 
    typings.finalForm.mod.Unsubscribe
  ]
  
  type FieldSubscriber[FieldValue] = typings.finalForm.mod.Subscriber[typings.finalForm.mod.FieldState[FieldValue]]
  
  type FieldValidator[FieldValue] = js.Function3[
    /* value */ FieldValue, 
    /* allValues */ js.Object, 
    /* meta */ js.UndefOr[typings.finalForm.mod.FieldState[FieldValue]], 
    js.Any | js.Promise[js.Any]
  ]
  
  type FormSubscriber[FormValues, InitialFormValues] = typings.finalForm.mod.Subscriber[typings.finalForm.mod.FormState[FormValues, InitialFormValues]]
  
  type GetFieldValidator[FieldValue] = js.Function0[js.UndefOr[typings.finalForm.mod.FieldValidator[FieldValue]]]
  
  type GetIn_ = js.Function2[/* state */ js.Object, /* complexKey */ java.lang.String, js.Any]
  
  type IsEqual = js.Function2[/* a */ js.Any, /* b */ js.Any, scala.Boolean]
  
  type Mutator[FormValues, InitialFormValues] = js.Function3[
    /* args */ js.Any, 
    /* state */ typings.finalForm.mod.MutableState[FormValues, InitialFormValues], 
    /* tools */ typings.finalForm.mod.Tools[FormValues, InitialFormValues], 
    js.Any
  ]
  
  type RegisterField[FormValues] = js.Function4[
    /* keyof FormValues */ /* name */ java.lang.String, 
    /* subscriber */ typings.finalForm.mod.FieldSubscriber[
      /* import warning: importer.ImportType#apply Failed type conversion: FormValues[keyof FormValues] */ js.Any
    ], 
    /* subscription */ typings.finalForm.mod.FieldSubscription, 
    /* config */ js.UndefOr[
      typings.finalForm.mod.FieldConfig[
        /* import warning: importer.ImportType#apply Failed type conversion: FormValues[keyof FormValues] */ js.Any
      ]
    ], 
    typings.finalForm.mod.Unsubscribe
  ]
  
  type RenameField[FormValues, InitialFormValues] = js.Function3[
    /* state */ typings.finalForm.mod.MutableState[FormValues, InitialFormValues], 
    /* from */ java.lang.String, 
    /* to */ java.lang.String, 
    scala.Unit
  ]
  
  type SetIn_ = js.Function3[/* state */ js.Object, /* key */ java.lang.String, /* value */ js.Any, js.Object]
  
  type SubmissionErrors = typings.finalForm.mod.AnyObject
  
  type Subscriber[V] = js.Function1[/* value */ V, scala.Unit]
  
  type Subscription = org.scalablytyped.runtime.StringDictionary[scala.Boolean]
  
  type Unsubscribe = js.Function0[scala.Unit]
  
  type ValidationErrors = typings.finalForm.mod.AnyObject
}
