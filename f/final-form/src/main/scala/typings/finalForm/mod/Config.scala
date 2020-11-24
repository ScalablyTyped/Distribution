package typings.finalForm.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Config[FormValues, InitialFormValues] extends js.Object {
  
  var debug: js.UndefOr[DebugFunction[FormValues, InitialFormValues]] = js.native
  
  var destroyOnUnregister: js.UndefOr[Boolean] = js.native
  
  var initialValues: js.UndefOr[InitialFormValues] = js.native
  
  var keepDirtyOnReinitialize: js.UndefOr[Boolean] = js.native
  
  var mutators: js.UndefOr[StringDictionary[Mutator[FormValues, InitialFormValues]]] = js.native
  
  def onSubmit(values: FormValues, form: FormApi[FormValues, InitialFormValues]): js.UndefOr[SubmissionErrors | js.Promise[js.UndefOr[SubmissionErrors]] | Unit] = js.native
  def onSubmit(
    values: FormValues,
    form: FormApi[FormValues, InitialFormValues],
    callback: js.Function1[/* errors */ js.UndefOr[SubmissionErrors], Unit]
  ): js.UndefOr[SubmissionErrors | js.Promise[js.UndefOr[SubmissionErrors]] | Unit] = js.native
  
  var validate: js.UndefOr[
    js.Function1[
      /* values */ FormValues, 
      js.UndefOr[ValidationErrors | js.Promise[ValidationErrors]]
    ]
  ] = js.native
  
  var validateOnBlur: js.UndefOr[Boolean] = js.native
}
