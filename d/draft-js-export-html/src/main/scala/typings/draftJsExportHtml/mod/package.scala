package typings.draftJsExportHtml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type BlockRenderer = js.Function1[/* block */ typings.draftJs.mod.ContentBlock, java.lang.String]
  
  type BlockStyleFn = js.Function1[
    /* block */ typings.draftJs.mod.ContentBlock, 
    js.UndefOr[typings.draftJsExportHtml.mod.RenderConfig]
  ]
  
  type EntityStyleFn = js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify draftjs.EntityInstance */ /* entity */ js.Any, 
    js.UndefOr[typings.draftJsExportHtml.mod.RenderConfig]
  ]
}
