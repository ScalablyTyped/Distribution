organization := "org.scalablytyped"
name := "firebase__messaging"
version := "0.12.4-69067e"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "firebase__app" % "0.9.13-0d6d5a",
  "org.scalablytyped" %%% "firebase__app-types" % "0.9.0-43a1d7",
  "org.scalablytyped" %%% "firebase__component" % "0.6.4-f3258e",
  "org.scalablytyped" %%% "firebase__logger" % "0.4.0-7842bf",
  "org.scalablytyped" %%% "firebase__util" % "1.9.3-845e71",
  "org.scalablytyped" %%% "sinon" % "10.0-dt-20230514Z-2ebaae",
  "org.scalablytyped" %%% "sinonjs__fake-timers" % "8.1-dt-20220323Z-d63db7",
  "org.scalablytyped" %%% "std" % "5.1-9d5ad2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
