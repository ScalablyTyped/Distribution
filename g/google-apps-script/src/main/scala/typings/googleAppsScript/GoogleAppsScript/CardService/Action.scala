package typings.googleAppsScript.GoogleAppsScript.CardService

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An action that enables interactivity within UI elements. The action does not happen directly on
  * the client but rather invokes an Apps Script callback function with optional parameters.
  *
  *     var image = CardService.newImage()
  *         .setOnClickAction(CardService.newAction()
  *             .setFunctionName("handleImageClick")
  *             .setParameters({imageSrc: 'carImage'}));
  */
@js.native
trait Action extends StObject {
  
  def setFunctionName(functionName: String): Action = js.native
  
  def setLoadIndicator(loadIndicator: LoadIndicator): Action = js.native
  
  /** @deprecated DO NOT USE */ def setMethodName(functionName: String): Action = js.native
  
  def setParameters(parameters: StringDictionary[String]): Action = js.native
}
object Action {
  
  @scala.inline
  def apply(
    setFunctionName: String => Action,
    setLoadIndicator: LoadIndicator => Action,
    setMethodName: String => Action,
    setParameters: StringDictionary[String] => Action
  ): Action = {
    val __obj = js.Dynamic.literal(setFunctionName = js.Any.fromFunction1(setFunctionName), setLoadIndicator = js.Any.fromFunction1(setLoadIndicator), setMethodName = js.Any.fromFunction1(setMethodName), setParameters = js.Any.fromFunction1(setParameters))
    __obj.asInstanceOf[Action]
  }
  
  @scala.inline
  implicit class ActionMutableBuilder[Self <: Action] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSetFunctionName(value: String => Action): Self = StObject.set(x, "setFunctionName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetLoadIndicator(value: LoadIndicator => Action): Self = StObject.set(x, "setLoadIndicator", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMethodName(value: String => Action): Self = StObject.set(x, "setMethodName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetParameters(value: StringDictionary[String] => Action): Self = StObject.set(x, "setParameters", js.Any.fromFunction1(value))
  }
}
