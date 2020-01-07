package typings.googleapis.buildSrcApisDeploymentmanagerAlphaMod.deploymentmanager_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Deployment Manager will call these methods during the events of
  * creation/deletion/update/get/setIamPolicy
  */
@js.native
trait Schema$MethodMap extends js.Object {
  /**
    * The action identifier for the create method to be used for this
    * collection
    */
  var create: js.UndefOr[String] = js.native
  /**
    * The action identifier for the delete method to be used for this
    * collection
    */
  var delete: js.UndefOr[String] = js.native
  /**
    * The action identifier for the get method to be used for this collection
    */
  var get: js.UndefOr[String] = js.native
  /**
    * The action identifier for the setIamPolicy method to be used for this
    * collection
    */
  var setIamPolicy: js.UndefOr[String] = js.native
  /**
    * The action identifier for the update method to be used for this
    * collection
    */
  var update: js.UndefOr[String] = js.native
}

object Schema$MethodMap {
  @scala.inline
  def apply(
    create: String = null,
    delete: String = null,
    get: String = null,
    setIamPolicy: String = null,
    update: String = null
  ): Schema$MethodMap = {
    val __obj = js.Dynamic.literal()
    if (create != null) __obj.updateDynamic("create")(create.asInstanceOf[js.Any])
    if (delete != null) __obj.updateDynamic("delete")(delete.asInstanceOf[js.Any])
    if (get != null) __obj.updateDynamic("get")(get.asInstanceOf[js.Any])
    if (setIamPolicy != null) __obj.updateDynamic("setIamPolicy")(setIamPolicy.asInstanceOf[js.Any])
    if (update != null) __obj.updateDynamic("update")(update.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$MethodMap]
  }
}

