package typings.expoSqlite.sqliteTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Window extends js.Object {
  
  var openDatabase: js.UndefOr[
    js.Function5[
      /* name */ String, 
      /* version */ String, 
      /* displayName */ String, 
      /* estimatedSize */ Double, 
      /* creationCallback */ js.UndefOr[DatabaseCallback], 
      Database
    ]
  ] = js.native
}
object Window {
  
  @scala.inline
  def apply(): Window = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Window]
  }
  
  @scala.inline
  implicit class WindowOps[Self <: Window] (val x: Self) extends AnyVal {
    
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
    def setOpenDatabase(
      value: (/* name */ String, /* version */ String, /* displayName */ String, /* estimatedSize */ Double, /* creationCallback */ js.UndefOr[DatabaseCallback]) => Database
    ): Self = this.set("openDatabase", js.Any.fromFunction5(value))
    
    @scala.inline
    def deleteOpenDatabase: Self = this.set("openDatabase", js.undefined)
  }
}
