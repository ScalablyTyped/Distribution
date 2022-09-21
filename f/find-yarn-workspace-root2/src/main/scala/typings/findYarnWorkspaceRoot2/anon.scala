package typings.findYarnWorkspaceRoot2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0`[T /* <: js.Array[String] */] extends StObject {
    
    var workspaces: js.UndefOr[T] = js.undefined
  }
  object `0` {
    
    inline def apply[T /* <: js.Array[String] */](): `0`[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`0`[T]]
    }
    
    extension [Self <: `0`[?], T /* <: js.Array[String] */](x: Self & `0`[T]) {
      
      inline def setWorkspaces(value: T): Self = StObject.set(x, "workspaces", value.asInstanceOf[js.Any])
      
      inline def setWorkspacesUndefined: Self = StObject.set(x, "workspaces", js.undefined)
    }
  }
  
  trait `1`[T /* <: js.Array[String] */] extends StObject {
    
    var workspaces: js.UndefOr[Packages[T]] = js.undefined
  }
  object `1` {
    
    inline def apply[T /* <: js.Array[String] */](): `1`[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`1`[T]]
    }
    
    extension [Self <: `1`[?], T /* <: js.Array[String] */](x: Self & `1`[T]) {
      
      inline def setWorkspaces(value: Packages[T]): Self = StObject.set(x, "workspaces", value.asInstanceOf[js.Any])
      
      inline def setWorkspacesUndefined: Self = StObject.set(x, "workspaces", js.undefined)
    }
  }
  
  trait Done extends StObject {
    
    var done: Boolean
    
    var found: String
    
    var relativePath: String
  }
  object Done {
    
    inline def apply(done: Boolean, found: String, relativePath: String): Done = {
      val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], found = found.asInstanceOf[js.Any], relativePath = relativePath.asInstanceOf[js.Any])
      __obj.asInstanceOf[Done]
    }
    
    extension [Self <: Done](x: Self) {
      
      inline def setDone(value: Boolean): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setFound(value: String): Self = StObject.set(x, "found", value.asInstanceOf[js.Any])
      
      inline def setRelativePath(value: String): Self = StObject.set(x, "relativePath", value.asInstanceOf[js.Any])
    }
  }
  
  trait Packages[T /* <: js.Array[String] */] extends StObject {
    
    var packages: T
  }
  object Packages {
    
    inline def apply[T /* <: js.Array[String] */](packages: T): Packages[T] = {
      val __obj = js.Dynamic.literal(packages = packages.asInstanceOf[js.Any])
      __obj.asInstanceOf[Packages[T]]
    }
    
    extension [Self <: Packages[?], T /* <: js.Array[String] */](x: Self & Packages[T]) {
      
      inline def setPackages(value: T): Self = StObject.set(x, "packages", value.asInstanceOf[js.Any])
    }
  }
  
  trait Workspaces extends StObject {
    
    var workspaces: js.UndefOr[Any] = js.undefined
  }
  object Workspaces {
    
    inline def apply(): Workspaces = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Workspaces]
    }
    
    extension [Self <: Workspaces](x: Self) {
      
      inline def setWorkspaces(value: Any): Self = StObject.set(x, "workspaces", value.asInstanceOf[js.Any])
      
      inline def setWorkspacesUndefined: Self = StObject.set(x, "workspaces", js.undefined)
    }
  }
}
