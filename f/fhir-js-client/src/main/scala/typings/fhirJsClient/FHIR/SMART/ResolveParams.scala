package typings.fhirJsClient.FHIR.SMART

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the parameter to be passed to the resolve api method
  */
@js.native
trait ResolveParams extends js.Object {
  /**
    * The Bundle resource in which the reference will be resolved if the reference is a contained one within the bundle.
    */
  var bundle: js.UndefOr[Resource] = js.native
  /**
    * Represents a reference within a resource. It can be a contained one(within the resource or a bundle) or a remote resource(eg {ResourceType}/{id})
    */
  var reference: Reference = js.native
  /**
    * The resource in which the reference will be resolved if the reference is a contained one.
    */
  var resource: js.UndefOr[Resource] = js.native
}

object ResolveParams {
  @scala.inline
  def apply(reference: Reference): ResolveParams = {
    val __obj = js.Dynamic.literal(reference = reference.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolveParams]
  }
  @scala.inline
  implicit class ResolveParamsOps[Self <: ResolveParams] (val x: Self) extends AnyVal {
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
    def setReference(value: Reference): Self = this.set("reference", value.asInstanceOf[js.Any])
    @scala.inline
    def setBundle(value: Resource): Self = this.set("bundle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBundle: Self = this.set("bundle", js.undefined)
    @scala.inline
    def setResource(value: Resource): Self = this.set("resource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResource: Self = this.set("resource", js.undefined)
  }
  
}

