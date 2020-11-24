package typings.devtoolsProtocol.mod.Protocol.Database

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Database extends js.Object {
  
  /**
    * Database domain.
    */
  var domain: String = js.native
  
  /**
    * Database ID.
    */
  var id: DatabaseId = js.native
  
  /**
    * Database name.
    */
  var name: String = js.native
  
  /**
    * Database version.
    */
  var version: String = js.native
}
object Database {
  
  @scala.inline
  def apply(domain: String, id: DatabaseId, name: String, version: String): Database = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Database]
  }
  
  @scala.inline
  implicit class DatabaseOps[Self <: typings.devtoolsProtocol.mod.Protocol.Database.Database] (val x: Self) extends AnyVal {
    
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
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: DatabaseId): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
  }
}
