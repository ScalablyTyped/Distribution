package typings.doctrine.mod

import typings.doctrine.anon.Midstream
import typings.doctrine.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def parse(content: String): Annotation = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(content.asInstanceOf[js.Any]).asInstanceOf[Annotation]
inline def parse(content: String, options: Options): Annotation = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Annotation]

inline def parseParamType: js.Function2[/* src */ String, /* options */ js.UndefOr[Midstream], Type_] = ^.asInstanceOf[js.Dynamic].selectDynamic("parseParamType").asInstanceOf[js.Function2[/* src */ String, /* options */ js.UndefOr[Midstream], Type_]]

inline def parseType: js.Function2[/* src */ String, /* options */ js.UndefOr[Midstream], Type_] = ^.asInstanceOf[js.Dynamic].selectDynamic("parseType").asInstanceOf[js.Function2[/* src */ String, /* options */ js.UndefOr[Midstream], Type_]]

inline def unwrapComment(doc: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unwrapComment")(doc.asInstanceOf[js.Any]).asInstanceOf[String]

inline def version: String = ^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[String]
