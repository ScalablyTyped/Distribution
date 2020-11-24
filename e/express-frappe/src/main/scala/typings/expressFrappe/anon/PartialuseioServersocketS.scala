package typings.expressFrappe.anon

import typings.socketIo.mod.Server
import typings.socketIo.mod.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{use (io : socket.io.socket.io.Server, socket : socket.io.socket.io.Socket, next : (err : any | undefined): void): void, onConnect (io : socket.io.socket.io.Server, socket : socket.io.socket.io.Socket): void, onDisconnect (io : socket.io.socket.io.Server, socket : socket.io.socket.io.Socket): void, [eventHandler: string] : (io : socket.io.socket.io.Server, socket : socket.io.socket.io.Socket, data : any, cb : std.Function): void}> */
@js.native
trait PartialuseioServersocketS extends js.Object {
  
  var onConnect: js.UndefOr[js.Function2[/* io */ Server, /* socket */ Socket, Unit]] = js.native
  
  var onDisconnect: js.UndefOr[js.Function2[/* io */ Server, /* socket */ Socket, Unit]] = js.native
  
  var use: js.UndefOr[
    js.Function3[
      /* io */ Server, 
      /* socket */ Socket, 
      /* next */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], 
      Unit
    ]
  ] = js.native
}
object PartialuseioServersocketS {
  
  @scala.inline
  def apply(): PartialuseioServersocketS = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialuseioServersocketS]
  }
  
  @scala.inline
  implicit class PartialuseioServersocketSOps[Self <: PartialuseioServersocketS] (val x: Self) extends AnyVal {
    
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
    def setOnConnect(value: (/* io */ Server, /* socket */ Socket) => Unit): Self = this.set("onConnect", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnConnect: Self = this.set("onConnect", js.undefined)
    
    @scala.inline
    def setOnDisconnect(value: (/* io */ Server, /* socket */ Socket) => Unit): Self = this.set("onDisconnect", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnDisconnect: Self = this.set("onDisconnect", js.undefined)
    
    @scala.inline
    def setUse(
      value: (/* io */ Server, /* socket */ Socket, /* next */ js.Function1[/* err */ js.UndefOr[js.Any], Unit]) => Unit
    ): Self = this.set("use", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteUse: Self = this.set("use", js.undefined)
  }
}
