package typings.firefoxWebextBrowser.browser.devtools.inspectedWindow

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* devtools.inspectedWindow types */
/** A resource within the inspected page, such as a document, a script, or an image. */
@js.native
trait Resource extends js.Object {
  
  /**
    * Gets the content of the resource.
    * @deprecated Unsupported on Firefox at this time.
    */
  var getContent: js.UndefOr[js.Function0[js.Promise[js.Object]]] = js.native
  
  /**
    * Sets the content of the resource.
    * @param content New content of the resource. Only resources with the text type are currently supported.
    * @param commit True if the user has finished editing the resource, and the new content of the resource should be persisted; false if this is a minor change sent in progress of the user editing the resource.
    * @deprecated Unsupported on Firefox at this time.
    */
  var setContent: js.UndefOr[
    js.Function2[/* content */ String, /* commit */ Boolean, js.Promise[StringDictionary[_]]]
  ] = js.native
  
  /** The URL of the resource. */
  var url: String = js.native
}
object Resource {
  
  @scala.inline
  def apply(url: String): Resource = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  
  @scala.inline
  implicit class ResourceOps[Self <: Resource] (val x: Self) extends AnyVal {
    
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetContent(value: () => js.Promise[js.Object]): Self = this.set("getContent", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetContent: Self = this.set("getContent", js.undefined)
    
    @scala.inline
    def setSetContent(value: (/* content */ String, /* commit */ Boolean) => js.Promise[StringDictionary[_]]): Self = this.set("setContent", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSetContent: Self = this.set("setContent", js.undefined)
  }
}
