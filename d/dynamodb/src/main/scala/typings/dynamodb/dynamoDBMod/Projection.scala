package typings.dynamodb.dynamoDBMod

import typings.dynamodb.dynamodbStrings.ALL
import typings.dynamodb.dynamodbStrings.INCLUDE
import typings.dynamodb.dynamodbStrings.KEYS_ONLY
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Projection extends js.Object {
  
  var NonKeyAttributes: js.UndefOr[js.Array[String]] = js.native
  
  var ProjectionType: js.UndefOr[ALL | KEYS_ONLY | INCLUDE | String] = js.native
}
object Projection {
  
  @scala.inline
  def apply(): Projection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Projection]
  }
  
  @scala.inline
  implicit class ProjectionOps[Self <: Projection] (val x: Self) extends AnyVal {
    
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
    def setNonKeyAttributesVarargs(value: String*): Self = this.set("NonKeyAttributes", js.Array(value :_*))
    
    @scala.inline
    def setNonKeyAttributes(value: js.Array[String]): Self = this.set("NonKeyAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNonKeyAttributes: Self = this.set("NonKeyAttributes", js.undefined)
    
    @scala.inline
    def setProjectionType(value: ALL | KEYS_ONLY | INCLUDE | String): Self = this.set("ProjectionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjectionType: Self = this.set("ProjectionType", js.undefined)
  }
}
