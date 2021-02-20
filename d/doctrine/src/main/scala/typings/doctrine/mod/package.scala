package typings.doctrine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def parse(content: java.lang.String): typings.doctrine.mod.Annotation = typings.doctrine.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parse")(content.asInstanceOf[js.Any]).asInstanceOf[typings.doctrine.mod.Annotation]
  @scala.inline
  def parse(content: java.lang.String, options: typings.doctrine.mod.Options): typings.doctrine.mod.Annotation = (typings.doctrine.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parse")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.doctrine.mod.Annotation]
  
  @scala.inline
  def parseParamType: js.Function2[
    /* src */ java.lang.String, 
    /* options */ js.UndefOr[typings.doctrine.anon.Midstream], 
    typings.doctrine.mod.Type_
  ] = typings.doctrine.mod.^.asInstanceOf[js.Dynamic].selectDynamic("parseParamType").asInstanceOf[js.Function2[
    /* src */ java.lang.String, 
    /* options */ js.UndefOr[typings.doctrine.anon.Midstream], 
    typings.doctrine.mod.Type_
  ]]
  
  @scala.inline
  def parseType: js.Function2[
    /* src */ java.lang.String, 
    /* options */ js.UndefOr[typings.doctrine.anon.Midstream], 
    typings.doctrine.mod.Type_
  ] = typings.doctrine.mod.^.asInstanceOf[js.Dynamic].selectDynamic("parseType").asInstanceOf[js.Function2[
    /* src */ java.lang.String, 
    /* options */ js.UndefOr[typings.doctrine.anon.Midstream], 
    typings.doctrine.mod.Type_
  ]]
  
  @scala.inline
  def unwrapComment(doc: java.lang.String): java.lang.String = typings.doctrine.mod.^.asInstanceOf[js.Dynamic].applyDynamic("unwrapComment")(doc.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  @scala.inline
  def version: java.lang.String = typings.doctrine.mod.^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[java.lang.String]
}
