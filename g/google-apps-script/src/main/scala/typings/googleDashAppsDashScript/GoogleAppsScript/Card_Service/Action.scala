package typings.googleDashAppsDashScript.GoogleAppsScript.Card_Service

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An action that enables interactivity within UI elements. The action does not happen directly on
  * the client but rather invokes an Apps Script callback function with optional parameters.
  *
  *     var image = CardService.newImage()
  *         .setOnClickAction(CardService.newAction()
  *             .setFunctionName("handleImageClick")
  *             .setParameters({imageSrc: 'carImage'}));
  */
trait Action extends js.Object {
  def setFunctionName(functionName: String): Action
  def setLoadIndicator(loadIndicator: LoadIndicator): Action
  /** @deprecated DO NOT USE */
  def setMethodName(functionName: String): Action
  def setParameters(parameters: StringDictionary[String]): Action
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
}

