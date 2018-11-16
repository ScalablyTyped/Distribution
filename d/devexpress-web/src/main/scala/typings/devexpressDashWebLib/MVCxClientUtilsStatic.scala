package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MVCxClientUtilsStatic extends js.Object {
  /**
       * Loads service resources (such as scripts, CSS files, etc.) required for DevExpress functionality to work properly after a non DevExpress callback has been processed on the server and returned back to the client.
       */
  def FinalizeCallback(): scala.Unit = js.native
  /**
       * Returns values of editors placed in the specified container.
       * @param containerOrId A container of editors, or its ID.
       */
  def GetSerializedEditorValuesInContainer(containerOrId: js.Object): js.Object = js.native
  /**
       * Returns values of editors placed in the specified container.
       * @param containerOrId A container of editors, or its ID.
       * @param processInvisibleEditors true to process both visible and invisible editors that belong to the specified container; false to process only visible editors.
       */
  def GetSerializedEditorValuesInContainer(containerOrId: js.Object, processInvisibleEditors: scala.Boolean): js.Object = js.native
}

