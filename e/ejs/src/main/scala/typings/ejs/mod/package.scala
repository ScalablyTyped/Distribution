package typings.ejs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AsyncClientFunction = js.Function4[
    /* locals */ js.UndefOr[typings.ejs.mod.Data], 
    /* escape */ js.UndefOr[typings.ejs.mod.EscapeCallback], 
    /* include */ js.UndefOr[typings.ejs.mod.IncludeCallback], 
    /* rethrow */ js.UndefOr[typings.ejs.mod.RethrowCallback], 
    js.Promise[java.lang.String]
  ]
  
  type AsyncTemplateFunction = js.Function1[/* data */ js.UndefOr[typings.ejs.mod.Data], js.Promise[java.lang.String]]
  
  type ClientFunction = js.Function4[
    /* locals */ js.UndefOr[typings.ejs.mod.Data], 
    /* escape */ js.UndefOr[typings.ejs.mod.EscapeCallback], 
    /* include */ js.UndefOr[typings.ejs.mod.IncludeCallback], 
    /* rethrow */ js.UndefOr[typings.ejs.mod.RethrowCallback], 
    java.lang.String
  ]
  
  type Data = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type EscapeCallback = js.Function1[/* markup */ js.UndefOr[js.Any], java.lang.String]
  
  type IncludeCallback = js.Function2[
    /* path */ java.lang.String, 
    /* data */ js.UndefOr[typings.ejs.mod.Data], 
    java.lang.String
  ]
  
  type RenderFileCallback[T] = js.Function2[/* err */ typings.std.Error | scala.Null, /* str */ java.lang.String, T]
  
  type RethrowCallback = js.Function5[
    /* err */ typings.std.Error, 
    /* str */ java.lang.String, 
    /* filename */ js.UndefOr[java.lang.String | scala.Null], 
    /* lineno */ scala.Double, 
    /* esc */ typings.ejs.mod.EscapeCallback, 
    scala.Nothing
  ]
  
  type TemplateFunction = js.Function1[/* data */ js.UndefOr[typings.ejs.mod.Data], java.lang.String]
  
  type fileLoader = js.Function1[/* path */ java.lang.String, java.lang.String | typings.ejs.anon.ToString]
}
