organization := "org.scalablytyped"
name := "firebase__database"
version := "0.8.1-dcee82"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "firebase__app-types" % "0.6.1-680562",
  "org.scalablytyped" %%% "firebase__auth-interop-types" % "0.1.5-8b0729",
  "org.scalablytyped" %%% "firebase__component" % "0.1.21-e877b4",
  "org.scalablytyped" %%% "firebase__database-types" % "0.6.1-01d1bb",
  "org.scalablytyped" %%% "firebase__logger" % "0.2.6-fc6b40",
  "org.scalablytyped" %%% "firebase__util" % "0.3.4-06d2d6",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
