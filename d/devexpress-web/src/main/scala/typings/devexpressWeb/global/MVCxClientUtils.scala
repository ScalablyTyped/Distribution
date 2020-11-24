package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object containing a service static function that can be useful when performing client-side processing.
  */
@JSGlobal("MVCxClientUtils")
@js.native
class MVCxClientUtils ()
  extends typings.devexpressWeb.MVCxClientUtils
/* static members */
@JSGlobal("MVCxClientUtils")
@js.native
object MVCxClientUtils extends js.Object {
  
  /**
    * Loads service resources (such as scripts, CSS files, etc.) required for DevExpress functionality to work properly after a non DevExpress callback has been processed on the server and returned back to the client.
    */
  def FinalizeCallback(): Unit = js.native
  
  /**
    * Returns values of editors placed in the specified container. An object containing pairs of editor names and values.
    * @param containerOrId A container of editors, or its ID.
    * @param processInvisibleEditors true to process both visible and invisible editors that belong to the specified container; false to process only visible editors.
    */
  def GetSerializedEditorValuesInContainer(containerOrId: js.Any): js.Any = js.native
  def GetSerializedEditorValuesInContainer(containerOrId: js.Any, processInvisibleEditors: Boolean): js.Any = js.native
  
  /**
    * Performs unobtrusive validation for editors in the specified container. true, if editors in the container pass the validation' otherwise, false.
    * @param container An HTML element that contains editors.
    * @param validateInvisibleEditors true, to validate visible and invisible DevExpress editors in the container; otherwise, to validate only visible editors.
    */
  def PerformValidationInContainer(container: js.Any): Boolean = js.native
  def PerformValidationInContainer(container: js.Any, validateInvisibleEditors: Boolean): Boolean = js.native
  
  /**
    * Performs unobtrusive validation for editors in the specified container. true, if editors in the container pass the validation' otherwise, false.
    * @param containerId The ID of an HTML element that contains editors.
    * @param validateInvisibleEditors true, to validate visible and invisible DevExpress editors in the container; otherwise, to validate only visible editors.
    */
  def PerformValidationInContainerById(containerId: String): Boolean = js.native
  def PerformValidationInContainerById(containerId: String, validateInvisibleEditors: Boolean): Boolean = js.native
}
