package typings.firebaseDatabase.privateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @license
  * Copyright 2017 Google LLC
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
  * You may obtain a copy of the License at
  *
  *   http://www.apache.org/licenses/LICENSE-2.0
  *
  * Unless required by applicable law or agreed to in writing, software
  * distributed under the License is distributed on an "AS IS" BASIS,
  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  * See the License for the specific language governing permissions and
  * limitations under the License.
  */
/**
  * An immutable object representing a parsed path.  It's immutable so that you
  * can pass them around to other functions without worrying about them changing
  * it.
  */
trait Path extends StObject {
  
  var pieceNum_ : Double
  
  var pieces_ : js.Array[String]
}
object Path {
  
  inline def apply(pieceNum_ : Double, pieces_ : js.Array[String]): Path = {
    val __obj = js.Dynamic.literal(pieceNum_ = pieceNum_.asInstanceOf[js.Any], pieces_ = pieces_.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path]
  }
  
  extension [Self <: Path](x: Self) {
    
    inline def setPieceNum_(value: Double): Self = StObject.set(x, "pieceNum_", value.asInstanceOf[js.Any])
    
    inline def setPieces_(value: js.Array[String]): Self = StObject.set(x, "pieces_", value.asInstanceOf[js.Any])
    
    inline def setPieces_Varargs(value: String*): Self = StObject.set(x, "pieces_", js.Array(value*))
  }
}
