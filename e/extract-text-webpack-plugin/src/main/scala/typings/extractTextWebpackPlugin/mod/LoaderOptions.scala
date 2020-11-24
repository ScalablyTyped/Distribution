package typings.extractTextWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoaderOptions extends js.Object {
  
  /** the loader(s) that should be used when the css is not extracted (i.e. in an additional chunk when `allChunks: false`) */
  var fallback: js.UndefOr[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Loader */ js.Any) | (js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Loader */ _
    ])
  ] = js.native
  
  /** override the `publicPath` setting for this loader */
  var publicPath: js.UndefOr[String] = js.native
  
  /** the loader(s) that should be used for converting the resource to a css exporting module */
  var use: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Loader */ js.Any) | (js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Loader */ _
  ]) = js.native
}
object LoaderOptions {
  
  @scala.inline
  def apply(
    use: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Loader */ js.Any) | (js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Loader */ _
    ])
  ): LoaderOptions = {
    val __obj = js.Dynamic.literal(use = use.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoaderOptions]
  }
  
  @scala.inline
  implicit class LoaderOptionsOps[Self <: LoaderOptions] (val x: Self) extends AnyVal {
    
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
    def setUseVarargs(value: js.Any*): Self = this.set("use", js.Array(value :_*))
    
    @scala.inline
    def setUse(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Loader */ js.Any) | (js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Loader */ _
        ])
    ): Self = this.set("use", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFallbackVarargs(value: js.Any*): Self = this.set("fallback", js.Array(value :_*))
    
    @scala.inline
    def setFallback(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Loader */ js.Any) | (js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Loader */ _
        ])
    ): Self = this.set("fallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFallback: Self = this.set("fallback", js.undefined)
    
    @scala.inline
    def setPublicPath(value: String): Self = this.set("publicPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublicPath: Self = this.set("publicPath", js.undefined)
  }
}
