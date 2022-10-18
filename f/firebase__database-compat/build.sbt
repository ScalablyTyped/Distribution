organization := "org.scalablytyped"
name := "firebase__database-compat"
version := "0.2.9-976b4b"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "firebase__app" % "0.8.2-89416d",
  "org.scalablytyped" %%% "firebase__app-check-interop-types" % "0.1.0-d3f9b0",
  "org.scalablytyped" %%% "firebase__app-types" % "0.8.0-7e39e4",
  "org.scalablytyped" %%% "firebase__auth-interop-types" % "0.1.6-d88ada",
  "org.scalablytyped" %%% "firebase__component" % "0.5.20-e0fad8",
  "org.scalablytyped" %%% "firebase__database" % "0.13.9-713714",
  "org.scalablytyped" %%% "firebase__database-types" % "0.9.16-efbe00",
  "org.scalablytyped" %%% "firebase__logger" % "0.3.3-fcc6c3",
  "org.scalablytyped" %%% "firebase__util" % "1.7.2-632c97",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
