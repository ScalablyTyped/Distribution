package typings.giphyApi.mod

import typings.giphyApi.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def apply(): Giphy = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Giphy]
inline def apply(apiKeyOrOptions: String): Giphy = ^.asInstanceOf[js.Dynamic].apply(apiKeyOrOptions.asInstanceOf[js.Any]).asInstanceOf[Giphy]
inline def apply(apiKeyOrOptions: GiphyOptions): Giphy = ^.asInstanceOf[js.Dynamic].apply(apiKeyOrOptions.asInstanceOf[js.Any]).asInstanceOf[Giphy]

type Callback[TResponse] = js.Function2[/* err */ js.Error, /* res */ TResponse, Unit]
