package typings.from2.anon

import typings.from2.from2Booleans.`true`
import typings.node.BufferEncoding
import typings.node.streamMod.Readable
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  objectMode :true | undefined} & node.stream.ReadableOptions */
@js.native
trait objectModetrueundefinedRe extends js.Object {
  
  var autoDestroy: js.UndefOr[Boolean] = js.native
  
  var destroy: js.UndefOr[
    js.ThisFunction2[
      /* this */ Readable, 
      /* error */ Error | Null, 
      /* callback */ js.Function1[/* error */ Error | Null, Unit], 
      Unit
    ]
  ] = js.native
  
  var encoding: js.UndefOr[BufferEncoding] = js.native
  
  var highWaterMark: js.UndefOr[Double] = js.native
  
  var objectMode: js.UndefOr[`true`] with js.UndefOr[Boolean] = js.native
  
  var read: js.UndefOr[js.ThisFunction1[/* this */ Readable, /* size */ Double, Unit]] = js.native
}
object objectModetrueundefinedRe {
  
  @scala.inline
  def apply(objectMode: js.UndefOr[`true`] with js.UndefOr[Boolean]): objectModetrueundefinedRe = {
    val __obj = js.Dynamic.literal(objectMode = objectMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[objectModetrueundefinedRe]
  }
  
  @scala.inline
  implicit class objectModetrueundefinedReOps[Self <: objectModetrueundefinedRe] (val x: Self) extends AnyVal {
    
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
    def setObjectMode(value: js.UndefOr[`true`] with js.UndefOr[Boolean]): Self = this.set("objectMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoDestroy(value: Boolean): Self = this.set("autoDestroy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoDestroy: Self = this.set("autoDestroy", js.undefined)
    
    @scala.inline
    def setDestroy(
      value: js.ThisFunction2[
          /* this */ Readable, 
          /* error */ Error | Null, 
          /* callback */ js.Function1[/* error */ Error | Null, Unit], 
          Unit
        ]
    ): Self = this.set("destroy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
    
    @scala.inline
    def setEncoding(value: BufferEncoding): Self = this.set("encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    
    @scala.inline
    def setHighWaterMark(value: Double): Self = this.set("highWaterMark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighWaterMark: Self = this.set("highWaterMark", js.undefined)
    
    @scala.inline
    def setRead(value: js.ThisFunction1[/* this */ Readable, /* size */ Double, Unit]): Self = this.set("read", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRead: Self = this.set("read", js.undefined)
  }
}
