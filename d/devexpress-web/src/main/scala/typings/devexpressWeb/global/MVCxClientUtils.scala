package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object containing a service static function that can be useful when performing client-side processing.
  */
@JSGlobal("MVCxClientUtils")
@js.native
class MVCxClientUtils ()
  extends StObject
     with typings.devexpressWeb.MVCxClientUtils
object MVCxClientUtils {
  
  @JSGlobal("MVCxClientUtils")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Loads service resources (such as scripts, CSS files, etc.) required for DevExpress functionality to work properly after a non DevExpress callback has been processed on the server and returned back to the client.
    */
  /* static member */
  inline def FinalizeCallback(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("FinalizeCallback")().asInstanceOf[Unit]
  
  /**
    * Returns values of editors placed in the specified container. An object containing pairs of editor names and values.
    * @param containerOrId A container of editors, or its ID.
    * @param processInvisibleEditors true to process both visible and invisible editors that belong to the specified container; false to process only visible editors.
    */
  /* static member */
  inline def GetSerializedEditorValuesInContainer(containerOrId: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("GetSerializedEditorValuesInContainer")(containerOrId.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def GetSerializedEditorValuesInContainer(containerOrId: js.Any, processInvisibleEditors: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("GetSerializedEditorValuesInContainer")(containerOrId.asInstanceOf[js.Any], processInvisibleEditors.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /**
    * Performs unobtrusive validation for editors in the specified container. true, if editors in the container pass the validation' otherwise, false.
    * @param container An HTML element that contains editors.
    * @param validateInvisibleEditors true, to validate visible and invisible DevExpress editors in the container; otherwise, to validate only visible editors.
    */
  /* static member */
  inline def PerformValidationInContainer(container: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("PerformValidationInContainer")(container.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def PerformValidationInContainer(container: js.Any, validateInvisibleEditors: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("PerformValidationInContainer")(container.asInstanceOf[js.Any], validateInvisibleEditors.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Performs unobtrusive validation for editors in the specified container. true, if editors in the container pass the validation' otherwise, false.
    * @param containerId The ID of an HTML element that contains editors.
    * @param validateInvisibleEditors true, to validate visible and invisible DevExpress editors in the container; otherwise, to validate only visible editors.
    */
  /* static member */
  inline def PerformValidationInContainerById(containerId: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("PerformValidationInContainerById")(containerId.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def PerformValidationInContainerById(containerId: String, validateInvisibleEditors: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("PerformValidationInContainerById")(containerId.asInstanceOf[js.Any], validateInvisibleEditors.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
