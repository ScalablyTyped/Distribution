package typings.extractDomain

import typings.extractDomain.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  inline def extractDomain(url: String): String = js.Dynamic.global.applyDynamic("extractDomain")(url.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def extractDomain(url: String, opts: Options): String = (js.Dynamic.global.applyDynamic("extractDomain")(url.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def extractDomain(urls: js.Array[String]): js.Array[String] = js.Dynamic.global.applyDynamic("extractDomain")(urls.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def extractDomain(urls: js.Array[String], options: Options): js.Array[String] = (js.Dynamic.global.applyDynamic("extractDomain")(urls.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
}
