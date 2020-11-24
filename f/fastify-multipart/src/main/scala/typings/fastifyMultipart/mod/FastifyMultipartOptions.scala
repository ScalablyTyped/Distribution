package typings.fastifyMultipart.mod

import typings.fastifyMultipart.anon.FieldNameSize
import typings.node.streamMod.Readable
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FastifyMultipartOptions extends js.Object {
  
  /**
    * Append the multipart parameters to the body object
    */
  var addToBody: js.UndefOr[Boolean] = js.native
  
  /**
    * Only valid in the promise api. Append the multipart parameters to the body object.
    */
  var attachFieldsToBody: js.UndefOr[Boolean] = js.native
  
  var limits: js.UndefOr[FieldNameSize] = js.native
  
  /**
    * Manage the file stream like you need
    */
  var onFile: js.UndefOr[
    js.Function6[
      /* fieldName */ String, 
      /* stream */ Readable, 
      /* filename */ String, 
      /* encoding */ String, 
      /* mimetype */ String, 
      /* body */ Record[String, BodyEntry], 
      Unit | js.Promise[Unit]
    ]
  ] = js.native
  
  /**
    * Add a shared schema to validate the input fields
    */
  var sharedSchemaId: js.UndefOr[String] = js.native
}
object FastifyMultipartOptions {
  
  @scala.inline
  def apply(): FastifyMultipartOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FastifyMultipartOptions]
  }
  
  @scala.inline
  implicit class FastifyMultipartOptionsOps[Self <: FastifyMultipartOptions] (val x: Self) extends AnyVal {
    
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
    def setAddToBody(value: Boolean): Self = this.set("addToBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddToBody: Self = this.set("addToBody", js.undefined)
    
    @scala.inline
    def setAttachFieldsToBody(value: Boolean): Self = this.set("attachFieldsToBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttachFieldsToBody: Self = this.set("attachFieldsToBody", js.undefined)
    
    @scala.inline
    def setLimits(value: FieldNameSize): Self = this.set("limits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimits: Self = this.set("limits", js.undefined)
    
    @scala.inline
    def setOnFile(
      value: (/* fieldName */ String, /* stream */ Readable, /* filename */ String, /* encoding */ String, /* mimetype */ String, /* body */ Record[String, BodyEntry]) => Unit | js.Promise[Unit]
    ): Self = this.set("onFile", js.Any.fromFunction6(value))
    
    @scala.inline
    def deleteOnFile: Self = this.set("onFile", js.undefined)
    
    @scala.inline
    def setSharedSchemaId(value: String): Self = this.set("sharedSchemaId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSharedSchemaId: Self = this.set("sharedSchemaId", js.undefined)
  }
}
