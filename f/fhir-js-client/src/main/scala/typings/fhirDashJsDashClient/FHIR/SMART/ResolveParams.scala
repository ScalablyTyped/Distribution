package typings.fhirDashJsDashClient.FHIR.SMART

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the parameter to be passed to the resolve api method
  */
trait ResolveParams extends js.Object {
  /**
    * The Bundle resource in which the reference will be resolved if the reference is a contained one within the bundle.
    */
  var bundle: js.UndefOr[Resource] = js.undefined
  /**
    * Represents a reference within a resource. It can be a contained one(within the resource or a bundle) or a remote resource(eg {ResourceType}/{id})
    */
  var reference: Reference
  /**
    * The resource in which the reference will be resolved if the reference is a contained one.
    */
  var resource: js.UndefOr[Resource] = js.undefined
}

object ResolveParams {
  @scala.inline
  def apply(reference: Reference, bundle: Resource = null, resource: Resource = null): ResolveParams = {
    val __obj = js.Dynamic.literal(reference = reference.asInstanceOf[js.Any])
    if (bundle != null) __obj.updateDynamic("bundle")(bundle.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolveParams]
  }
}

