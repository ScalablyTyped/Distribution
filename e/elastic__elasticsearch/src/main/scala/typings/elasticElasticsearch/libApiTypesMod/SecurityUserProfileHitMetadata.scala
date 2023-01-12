package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityUserProfileHitMetadata extends StObject {
  
  var _primary_term: long
  
  var _seq_no: SequenceNumber
}
object SecurityUserProfileHitMetadata {
  
  inline def apply(_primary_term: long, _seq_no: SequenceNumber): SecurityUserProfileHitMetadata = {
    val __obj = js.Dynamic.literal(_primary_term = _primary_term.asInstanceOf[js.Any], _seq_no = _seq_no.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityUserProfileHitMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecurityUserProfileHitMetadata] (val x: Self) extends AnyVal {
    
    inline def set_primary_term(value: long): Self = StObject.set(x, "_primary_term", value.asInstanceOf[js.Any])
    
    inline def set_seq_no(value: SequenceNumber): Self = StObject.set(x, "_seq_no", value.asInstanceOf[js.Any])
  }
}
