package typings.googleAppsScript.GoogleAppsScript.CardService

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
@js.native
trait Action extends js.Object {
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
  implicit class ActionOps[Self <: Action] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSetFunctionName(value: String => Action): Self = this.set("setFunctionName", js.Any.fromFunction1(value))
    @scala.inline
    def setSetLoadIndicator(value: LoadIndicator => Action): Self = this.set("setLoadIndicator", js.Any.fromFunction1(value))
    @scala.inline
    def setSetMethodName(value: String => Action): Self = this.set("setMethodName", js.Any.fromFunction1(value))
    @scala.inline
    def setSetParameters(value: StringDictionary[String] => Action): Self = this.set("setParameters", js.Any.fromFunction1(value))
  }
  
}

