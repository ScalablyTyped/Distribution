package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object containing a service static function that can be useful when performing client-side processing.
  */
@JSGlobal("MVCxClientUtils")
@js.native
class MVCxClientUtils () extends js.Object

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
}

